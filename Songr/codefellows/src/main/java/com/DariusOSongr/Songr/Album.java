package com.DariusOSongr.Songr;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/album")
public class Album {
    @GetMapping("/album/{name}")
    public String albumModel(@PathVariable String name, Model modVarible) {
        MyModal model = new MyModal();
        MyModal.title = "title";
        MyModal.artist = "artist";
        MyModal.songCount = 12;
        MyModal.albumLengthSeconds = 10500;

        modVarible.addAttribute("model", model);
        return "album";
    }
}



