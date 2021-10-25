package se.hvih.sokoban

import android.widget.ImageView

abstract class Actor {

    private val SPACE: Int = 20

    private var x: Int = 0
    private var y: Int = 0

    private lateinit var imageView: ImageView

    fun isLeftCollision(actor: Actor): Boolean {
        return x - SPACE == actor.x && y == actor.y
    }

    fun isRightCollision(actor: Actor): Boolean {
        return x + SPACE == actor.x && y == actor.y
    }

    fun isUpCollision(actor: Actor): Boolean {
        return x == actor.x && y - SPACE == actor.y
    }

    fun isDownCollision(actor: Actor): Boolean {
        return x == actor.x && y + SPACE == actor.y
    }

    abstract fun move(direction: Direction)
}