package vuttr

class Tool {
    String title
    String Link
    String description
    List<String> tags

    static constraints = {
    }

    static hasMany = [tags: String]

}
