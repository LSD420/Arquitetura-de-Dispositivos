/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.smarttermoazureiot;

import com.microsoft.azure.sdk.iot.device.*;
import com.microsoft.azure.sdk.iot.device.DeviceTwin.*;
import com.google.gson.Gson;

import java.io.*;
import java.net.URISyntaxException;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

/**
 *
 * @author Turma A
 */
public class DirectMethodStatusCallback implements IotHubEventCallback {
     public void execute(IotHubStatusCode status, Object context)
    {
      System.out.println("Direct method # IoT Hub responded to device method acknowledgement with status: " + status.name());
    }
    
}
