/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

public class GUIContr {
    public static GUIAuth firstpage;
    public static GUIInter secondpage;   
   
    public static void showAuth(){
        firstpage=new GUIAuth();
        firstpage.setVisible(true);
   }
   
   public static void showMain(String s){
        secondpage = new GUIInter(s);
        secondpage.setVisible(true);
   }
}
