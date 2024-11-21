package xyz.hyeonjae.origami.ui.viewdata

data class PaperCardViewData(
    val id: Int,
    val image: String,
    val name: String,
    val description: String,
    val rating: Double,
) {
    companion object {
        val sample: PaperCardViewData by lazy {
            PaperCardViewData(
                0,
                "https://fastly.picsum.photos/id/509/600/600.jpg?hmac=kbFfy3eA9yAzjUpVAWBX5zoyUFFwKbMPbZX7pgLPIsM",
                "Lorem Ipsum",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc eu dignissim eros, a ullamcorper neque.",
                4.7
            )
        }
    }
}