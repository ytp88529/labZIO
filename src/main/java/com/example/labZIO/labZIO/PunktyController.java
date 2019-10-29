package com.example.labZIO.labZIO;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@RestController
@RequestMapping("/punkty")
public class PunktyController {
    //List<String> lista = new CopyOnWriteArrayList<>(new String[] { "user1", "user2", "user3" });
    private StudentService service = new StudentService();
    @RequestMapping(value = "/students", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<Student> getUsers()
    {
        return this.service.getStudents().asJava();
    }

    @RequestMapping(value = "/students", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Student addUser(@RequestBody NewStudent newStudent)
    {
        // lista.add(name);
        return this.service.addStudent(newStudent);
    }
}


// POPRZEDNIE ZADANIE
//@RestController
//@RequestMapping("/punkty")
//public class PunktyController {
//    List<String> lista = new CopyOnWriteArrayList<>(new String[] { "user1", "user2", "user3" });
//    @RequestMapping(value = "/users", method = RequestMethod.GET)
//    public List<String> getUsers()
//    {
//        return lista;
//    }
//
//    @RequestMapping(value = "/users", method = RequestMethod.POST)
//    public int addUser(@RequestBody String name)
//    {
//        lista.add(name);
//        return lista.size();
//    }
//}
