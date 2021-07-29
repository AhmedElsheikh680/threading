package com.threading;

import com.threading.controller.StudentController;

public class ReadFile {

    public void print(){
        BufferedReader reader;
        reader = new BufferedReader(
                new FileReader("D:\\Spring\\intellij\\todo-api-main\\threading\\thread-files\\files\\history.txt"));
        reader.readLine();
    }

}
