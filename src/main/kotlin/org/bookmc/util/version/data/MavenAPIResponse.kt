package org.bookmc.util.version.data

data class MavenAPIResponse(
    val files: List<File>
) {
    data class File(val type: String, val name: String)
}
