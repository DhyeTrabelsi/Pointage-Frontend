import 'package:flutter/material.dart';
import 'package:convex_bottom_bar/convex_bottom_bar.dart';
import 'package:pointage/user/missions.dart';
import 'package:pointage/user/profile.dart';
import 'package:pointage/user/taches.dart';

import 'drawer.dart';

const _kPages = <String, IconData>{
  'missions': Icons.task,
  'informations': Icons.home,
  'travail': Icons.location_on,
};

class Home extends StatefulWidget {
  Home({Key key}) : super(key: key);

  @override
  _Homeuser createState() => _Homeuser();
}

class _Homeuser extends State<Home> {
  TabStyle _tabStyle = TabStyle.reactCircle;
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        backgroundColor: Color(0xffA9D7F6),
        title: const Text('User name'),
      ),
      body: new Container(
          child: DefaultTabController(
        initialIndex: 1,
        length: 3,
        child: Scaffold(
          body: Column(
            children: [
              Expanded(
                child: TabBarView(
                  children: [
                    for (final icon in _kPages.keys)
                      if (icon == 'travail')
                        Taches()
                      else if (icon == 'missions')
                        Missions()
                      else if (icon == 'informations')
                        Profile()
                  ],
                ),
              ),
            ],
          ),

          /// on peut ajouter le numero des missions afair grace aux .badge
          bottomNavigationBar: ConvexAppBar(
            style: _tabStyle,
            backgroundColor: Color(0xff8FB1E9),
            items: <TabItem>[
              TabItem(icon: Icons.task, title: 'missions'),
              TabItem(title: 'informations', icon: Icons.home),
              TabItem(title: 'travail', icon: Icons.location_on),
            ],
            onTap: (int i) => print('click index=$i'),
          ),
        ),
      )),
      drawer: AppDrawer(),
    );
  }
}

// <void> means this route returns nothing.
