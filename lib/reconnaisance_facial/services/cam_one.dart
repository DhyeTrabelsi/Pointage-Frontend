import 'dart:io';

import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';
import 'package:image_picker/image_picker.dart';
import 'package:pointage/code_qr/scan.dart';

class CamOpen extends StatefulWidget {
  @override
  Statecam createState() => Statecam();
}

class Statecam extends State<CamOpen> {
  File image;

  int trouve = 0;

  String locationMessage = '';
  picker() async {
    File img = await ImagePicker.pickImage(source: ImageSource.camera);
    if (img != null) {
      trouve = 1;
      locationMessage = "Image valide";
      image = img;
      setState(() {});
    }
  }

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
                        Icon(Icons.camera_front,
                            size: 45.0, color: Color(0xff0A043C)),
                        SizedBox(
                          height: 10.0,
                        ),
                        Text(
                          "Get User Face",
                          style: TextStyle(
                            fontSize: 25.0,
                            fontWeight: FontWeight.bold,
                            color: Colors.white,
                          ),
                        ),
                        SizedBox(
                          height: 80.0,
                        ),
                        _faceButton(),
                        SizedBox(
                          height: 40.0,
                        ),
                        Text(
                          locationMessage,
                          style:
                              TextStyle(fontSize: 20, color: Color(0xff0A043C)),
                        ),
                        SizedBox(
                          height: 40.0,
                        ),
                        new Container(
                          width: 200,
                          child: Center(
                            child: image == null ? null : Image.file(image),
                          ),
                        )
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
                                      : () => setState(() => movecodeqr()),
                                  child: const Text('NEXT'),
                                ),
                              ])),
                    ]))));
  }

  Widget _faceButton() {
    return InkWell(
      onTap: () {
        picker();
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
          'Take your face',
          style: TextStyle(fontSize: 20, color: Color(0xff7C83FD)),
        ),
      ),
    );
  }

  movecodeqr() {
    Navigator.push(
        context, MaterialPageRoute(builder: (context) => ScanPage()));
  }
}
