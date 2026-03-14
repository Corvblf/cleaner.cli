package main.java.com.dupfinder.scanner;
import java.nio.file.Path;

public class FileRecord {
    //rules
    private final Path path;
    private final long size;
    private String hash;


    //contructor
    public FileRecord(Path path, long size){

        this.path = path;
        this.size = size;
        this.hash = null;
    }   
    

    //getters
    public Path getPath(){
        return path;
    }

    public long getSize(){
        return size;
    }

    public String getHash(){
        return hash;
    }

    //setter
    public void setHash(String hash){

        this.hash = hash;
    }


    @Override
    public String toString(){
        return path + "(" + size + "bytes)";

    }
}


