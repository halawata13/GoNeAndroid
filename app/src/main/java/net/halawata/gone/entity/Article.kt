package net.halawata.gone.entity

interface Article {

    val id: Long
    val title: String
    val url: String
    val pubDate: String
    val guid: String
    var isRead: Boolean
}
