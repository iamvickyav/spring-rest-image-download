package com.iamvickyav

import org.springframework.core.io.ClassPathResource
import org.springframework.http.MediaType
import org.springframework.util.StreamUtils
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

import javax.servlet.http.HttpServletResponse

@RestController
@RequestMapping("/image")
class ImageController {

    @RequestMapping(value = "/download", method = RequestMethod.GET)
    void downloadImage(HttpServletResponse response){

        ClassPathResource imageFile = new ClassPathResource("holmes.jpg")
        response.setContentType(MediaType.IMAGE_JPEG_VALUE)
        response.setHeader("Content-Disposition", "attachment; filename=\"sherlock_holmes.jpg\"")
        StreamUtils.copy(imageFile.getInputStream(), response.getOutputStream())
    }

    @RequestMapping(value = "/show", method = RequestMethod.GET)
    void showImage(HttpServletResponse response){

        ClassPathResource imageFile = new ClassPathResource("holmes.jpg")
        response.setContentType(MediaType.IMAGE_JPEG_VALUE)
        response.setHeader("Content-Disposition", "inline; filename=\"sherlock_holmes.jpg\"")
        StreamUtils.copy(imageFile.getInputStream(), response.getOutputStream())
    }
}
