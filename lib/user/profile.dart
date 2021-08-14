import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';

class Profile extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
        body: GridView.count(
            // Create a grid with 2 columns. If you change the scrollDirection to
            // horizontal, this would produce 2 rows.
            crossAxisCount: 2,
            // Generate 100 Widgets that display their index in the List
            children: List.generate(100, (index) {
              return Center(
                child: Container(
                  decoration: BoxDecoration(
                    border: Border.all(color: Colors.grey, width: 3.0),
                  ),
                  padding: const EdgeInsets.all(16.0),
                  child: Text(
                    'information $index',
                    style: Theme.of(context).textTheme.headline5,
                  ),
                ),
              );
            })));
  }
}
