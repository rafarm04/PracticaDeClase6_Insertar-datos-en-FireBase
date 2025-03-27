package com.interfazgrafica.version1.controllers;


import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.interfazgrafica.version1.services.FirebaseService;

@RestController
@RequestMapping("/api")
public class MyController {

    @Autowired
    private FirebaseService firebaseService;

    @PostMapping("/save/{name}")
    public String saveData(
            @PathVariable String name, // Nombre que se envía en la URL
            @RequestBody Object data   // Datos a guardar (puede ser un Map, un POJO, etc.)
    ) throws Exception {
        String collectionName = "users"; // Colección configurada internamente
        firebaseService.saveData(collectionName, data); // El ID se genera automáticamente
        return "Data saved successfully for user: " + name;
    }


    @GetMapping("/test-save/{name}")
    public String testSaveData(
            @PathVariable String name, // Nombre que se envía en la URL
            @RequestParam String email, // Email como parámetro de la URL
            @RequestParam int age // Edad como parámetro de la URL
    ) throws Exception {
        String collectionName = "users"; // Colección configurada internamente

        // Crear un mapa para simular el cuerpo de la solicitud
        Map<String, Object> data = new HashMap<>();
        data.put("name", name); // Guardar el nombre en el mapa
        data.put("email", email); // Guardar el email en el mapa
        data.put("age", age); // Guardar la edad en el mapa

        firebaseService.saveData(collectionName, data); // El ID se genera automáticamente
        return "Data saved successfully for user: " + name;
    }


    //Edit this get
    @GetMapping("/ticket/{name}")
    public String saveTicket(
            @PathVariable String name, // Nombre que se envía en la URL
            @RequestParam String responsible, // Email como parámetro de la URL
            @RequestParam String deadline // Edad como parámetro de la URL
    ) throws Exception {
        String collectionName = "ticket"; // Colección configurada internamente

        // Crear un mapa para simular el cuerpo de la solicitud
        Map<String, Object> data = new HashMap<>();
        data.put("name", name); // Guardar el nombre en el mapa
        data.put("responsible", responsible); // Guardar el email en el mapa
        data.put("deadline", deadline); // Guardar la edad en el mapa

        firebaseService.saveData(collectionName, data); // El ID se genera automáticamente
        return "Data saved successfully for user: " + name;
    }
}
// //http://Localhost:8080/api/test-save/JohnDoe%3Femail=alejandro%2540example.com&age=39