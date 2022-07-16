/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.LibMS.Common;

import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.apache.log4j.RollingFileAppender;

/**
 *
 * @author B.M.D.C.Bandara
 */
public class SystemLogger {
    public static Logger initLogger(Class className){
        try{
            String path = "C:\\Users\\B.M.D.C.Bandara\\Desktop\\log.txt";
            PatternLayout patternLayout = new PatternLayout("%-7p %d [%t] %c %x %M - %m%n");
            RollingFileAppender appender = new RollingFileAppender(patternLayout, path);
//            FileAppender fAppender = new FileAppender(patternLayout, path);
            appender.setMaxFileSize("10MB");
//            appender.setName("Library_system");
            appender.activateOptions();
            Logger.getRootLogger().addAppender(appender);
        } catch (Exception e){
            e.printStackTrace();
        }
        return Logger.getLogger(className);
    }
    
}
