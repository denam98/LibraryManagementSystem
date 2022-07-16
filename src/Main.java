
import com.LibMS.Common.PasswordEncription;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author B.M.D.C.Bandara
 */
public class Main {
    public static void main(String[] args) {
        String text = PasswordEncription.encrypt("1977");
        System.out.println(text);
        System.out.println(PasswordEncription.decrypt(text));
    }
}
