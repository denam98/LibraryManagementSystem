/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.LibMS.Common;

/**
 *
 * @author B.M.D.C.Bandara
 */
public class SystemData {

    private static SystemData currentUser;

    public static SystemData setCurrentUserInstance(String username, String role, int sysUserId) {
        if (currentUser == null) {
            currentUser = new SystemData(username, role, sysUserId);
        }
        return currentUser;
    }

    private static String username;
    private static String role;
    private static int sysUserId;

    private SystemData(String uname, String r, int userId) {
        username = uname;
        role = r;
        sysUserId = userId;
    }

    public static String getUsername() {
        return username;
    }

    public static int getSysUserId() {
        return sysUserId;
    }

    public static String getRole() {
        return role;
    }

    public static void flushCurrentUser(){
        currentUser = null;
        username = null;
        sysUserId = 0;
        role = null;
    }
    
    @Override
    public String toString() {
        return "Current user data{ \n\t"
                + "Username : " + username + "\n\t"
                + "systemUserID : " + sysUserId + "\n\t"
                + "role : " + role + "\n"
                + "}";
    }
}
