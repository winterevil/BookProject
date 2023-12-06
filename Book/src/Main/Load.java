/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;


/**
 *
 */
public class Load {

    public static void main(String[] args) {
        Loading l = new Loading();
        l.setVisible(true);
        LogIn m = new LogIn();
        m.setVisible(false);

        try {
            for (int x = 0; x <= 100; x++) {
                Thread.sleep(15);
                l.loadNum.setText(Integer.toString(x) + "%");
                l.loadBar.setValue(x);

                if (x == 100) {
                    l.setVisible(false);
                    m.setVisible(true);

                }
            }
        } catch (Exception e) {
        }
    }
}
