import 'package:barcode_scan/barcode_scan.dart';
import 'package:flutter/material.dart';
import 'package:pointage/user/home.dart';

class ScanPage extends StatefulWidget {
  @override
  _ScanPageState createState() => _ScanPageState();
}

class _ScanPageState extends State<ScanPage> {
  String qrCodeResult;

  bool backCamera = true;

  var trouve = 0;

  int camera = 1;

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
        title: 'pointage',
        theme: ThemeData(
          primarySwatch: Colors.blue,
        ),
        debugShowCheckedModeBanner: false,
        home: Scaffold(
            body: Container(
                padding: EdgeInsets.symmetric(horizontal: 20),
                height: MediaQuery.of(context).size.height,
                decoration: BoxDecoration(
                    borderRadius: BorderRadius.all(Radius.circular(5)),
                    boxShadow: <BoxShadow>[
                      BoxShadow(
                          color: Colors.grey.shade200,
                          offset: Offset(2, 4),
                          blurRadius: 5,
                          spreadRadius: 2)
                    ],
                    gradient: LinearGradient(
                        begin: Alignment.topCenter,
                        end: Alignment.bottomCenter,
                        colors: [Color(0xff88FFF7), Color(0xff96BAFF)])),
                child: Column(
                    mainAxisAlignment: MainAxisAlignment.center,
                    children: <Widget>[
                      Expanded(
                          child: Column(children: <Widget>[
                        SizedBox(
                          height: 100.0,
                        ),
                        Icon(Icons.qr_code,
                            size: 45.0, color: Color(0xff0A043C)),
                        SizedBox(
                          height: 10.0,
                        ),
                        Text(
                          "Get QR code ",
                          style: TextStyle(
                            fontSize: 25.0,
                            fontWeight: FontWeight.bold,
                            color: Colors.white,
                          ),
                        ),
                        SizedBox(
                          height: 80.0,
                        ),
                        _scanButton(),
                        SizedBox(
                          height: 80.0,
                        ),
                        Center(
                          child: Text(
                            (qrCodeResult == null) || (qrCodeResult == "")
                                ? "Please Scan to Show result"
                                : "" + qrCodeResult,
                            style: TextStyle(
                                fontSize: 20.0, fontWeight: FontWeight.w900),
                          ),
                        ),
                        SizedBox(
                          height: 80.0,
                        ),
                        Text("You can Check your camera at first !",
                            style: new TextStyle(color: Colors.white)),
                        SizedBox(
                          height: 20.0,
                        ),
                        _choixCam(),
                      ])),
                      Padding(
                          padding: const EdgeInsets.all(8.0),
                          child: Row(
                              mainAxisAlignment: MainAxisAlignment.end,
                              children: <Widget>[
                                ElevatedButton(
                                  style: ElevatedButton.styleFrom(
                                    primary: Color(0xff0A043C), // background
                                  ),
                                  onPressed: this.trouve == 0
                                      ? null
                                      : () => setState(() => finish()),
                                  child: const Text('NEXT'),
                                ),
                              ])),
                    ]))));
  }

  Widget _choixCam() {
    return InkWell(
        onTap: () {
          setState(() {
            backCamera = !backCamera;
            camera = backCamera ? 1 : -1;
          });
        },
        child: Container(
          height: 50,
          padding: EdgeInsets.symmetric(vertical: 13),
          alignment: Alignment.center,
          decoration: BoxDecoration(
              borderRadius: BorderRadius.all(Radius.circular(5)),
              color: Colors.white),
          child: Wrap(children: <Widget>[
            Text(
              (backCamera ? "Front Cam" : "Back Cam"),
              style: TextStyle(fontSize: 20, color: Color(0xff0A043C)),
            ),
          ]),
        ));
  }

  Widget _scanButton() {
    return InkWell(
      onTap: () async {
        ScanResult codeSanner = await BarcodeScanner.scan(
          options: ScanOptions(
            useCamera: camera,
          ),
        ); //barcode scnner
        setState(() {
          qrCodeResult = codeSanner.rawContent;
        });
      },
      child: Container(
        width: MediaQuery.of(context).size.width,
        padding: EdgeInsets.symmetric(vertical: 13),
        alignment: Alignment.center,
        decoration: BoxDecoration(
            borderRadius: BorderRadius.all(Radius.circular(5)),
            boxShadow: <BoxShadow>[
              BoxShadow(
                  color: Color(0xff7C83FD).withAlpha(100),
                  offset: Offset(2, 4),
                  blurRadius: 8,
                  spreadRadius: 2)
            ],
            color: Colors.white),
        child: Text(
          'Scan your QR code',
          style: TextStyle(fontSize: 20, color: Color(0xff7C83FD)),
        ),
      ),
    );
  }

  finish() {
    Navigator.push(context, MaterialPageRoute(builder: (context) => Home()));
  }
}
