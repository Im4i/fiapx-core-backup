package com.example.demo.adapter.gateway.interfaces;

import org.springframework.web.multipart.MultipartFile;

public interface ConverteVideoFrameAdapter {
    void execute(MultipartFile video);
}
