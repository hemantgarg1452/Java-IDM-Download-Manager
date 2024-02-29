package org.example;

import org.example.models.FileInfo;

import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;

public class DownloadThread extends Thread{
    private FileInfo file;
    DownloadManager manager;

    public DownloadThread(FileInfo file, DownloadManager manager){
        this.file=file;
        this.manager=manager;
    }

    @Override
    public void run() {

        this.file.setStatus("Downloading");
        this.manager.updateUI(this.file);

        //Download Logix....
        try {
            Files.copy(new URL(this.file.getUrl()).openStream(), Paths.get(this.file.getPath()));
            this.file.setStatus("Donee");

        } catch (IOException e) {
            this.file.setStatus("Failed");
            System.out.println("Downloading Error");
            e.printStackTrace();
        }
        this.manager.updateUI(this.file);
    }
}
