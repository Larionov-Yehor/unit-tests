package com.in6k.tests.first;

import static org.junit.Assert.*;

import org.junit.Test;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReapetablePrincepleTest {
    @Test
    public void createFile() throws Exception {
        Path path = Paths.get("/home/employee/testfile.txt");
        File file = path.toFile();

        if(file.exists()) {
            boolean created = file.createNewFile();
            assertTrue("File must not exists before.", created);
        }

        if(file.exists()) {
            boolean deleted = file.delete();
            assertTrue("File must be deleted.", deleted);
        }


    }
}
