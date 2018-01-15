# **How to send an Image in REST Response**

By setting Response header as **Content-Disposition**, We can send Image in REST Response

**To Force Download Image** 

```
response.setHeader("Content-Disposition", "attachment; filename=\"sherlock_holmes.jpg\"")
```

**To Display Image in Browser instead of Downloading** 

```
response.setHeader("Content-Disposition", "inline; filename=\"sherlock_holmes.jpg\"")
```

Note : 

Image is placed inside **src/main/resources/** folder & we used **ClassPathResource** to access the image

```
ClassPathResource imageFile = new ClassPathResource("holmes.jpg")
```
