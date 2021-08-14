import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';

class Missions extends StatefulWidget {
  const Missions({Key key}) : super(key: key);

  @override
  State<StatefulWidget> createState() {
    return _Mission();
  }
}

class _Mission extends State<Missions> {
  bool _reverseSort = false;
  final List<String> _items = 'ABCDEFGHIJKLMNOPQRSTUVWXYZ'.split('').toList();

  // Handler called by ReorderableListView onReorder after a list child is
  // dropped into a new position.
  void _onReorder(int oldIndex, int newIndex) {
    setState(() {
      final newIdx = newIndex > oldIndex ? newIndex - 1 : newIndex;
      final item = _items.removeAt(oldIndex);
      _items.insert(newIdx, item);
    });
  }

  // Handler called when the "sort" button on appbar is clicked.
  void _onSort() {
    setState(() {
      _reverseSort = !_reverseSort;
      _items.sort((a, b) => _reverseSort ? b.compareTo(a) : a.compareTo(b));
    });
  }

  @override
  Widget build(BuildContext context) {
    final _appbar = AppBar(
      backgroundColor: Colors.white,
      automaticallyImplyLeading: false,
      actions: <Widget>[
        IconButton(
          color: Colors.lightBlue,
          icon: const Icon(Icons.sort_by_alpha),
          tooltip: 'Sort',
          onPressed: _onSort,
        ),
      ],
    );
    return Scaffold(
      appBar: _appbar,
      body: ReorderableListView(
        onReorder: _onReorder,
        children: [
          for (final item in _items)
            ListTile(
              /// ! Must provide unique Keys for ReorderableListView's children.
              key: Key(item),
              title: Text('mission $item'),
            )
        ],
      ),
    );
  }
}
