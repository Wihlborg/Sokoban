package se.hvih.sokoban

class Board {

    val walls : List<Wall> = ArrayList()
    val bags : List<Bag> = ArrayList()
    val areas : List<Area> = ArrayList()

    val player: Player = Player();

}