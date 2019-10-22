package com.tobibur.swipequotes.model

class ApiResponse {

    var posts: QuoteModel? = null
    var error: Throwable? = null
    var code : Int? = null

    constructor(posts: QuoteModel) {
        this.posts = posts
        this.error = null
    }

    constructor(error: Throwable) {
        this.error = error
        this.posts = null
    }

    constructor(code : Int){
        this.code = code
    }
}