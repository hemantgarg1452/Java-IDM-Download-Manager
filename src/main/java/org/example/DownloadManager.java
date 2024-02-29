package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import org.example.config.AppConfig;
import org.example.models.FileInfo;

import java.io.File;

public class DownloadManager {
    @FXML
    private TextField urlTextField;

    public int index=0;
    @FXML
    void downloadbuttonclicked(ActionEvent event) {

        String url = urlTextField.getText().trim();
            //https://codeWithBitLords/JavaIDM.exe
        String FileName = url.substring(url.lastIndexOf("/")+1);
        String status = "Starting";
        String Action = "Open";
        String path = AppConfig.DOWNLOAD_PATH + File.separator+FileName;
        FileInfo file = new FileInfo((index+1), FileName, url, status, Action, path);
        DownloadThread thread = new DownloadThread(file, this);
        thread.start();
    }

    public void updateUI(FileInfo metaFile){
        System.out.println(metaFile);
    }
}
