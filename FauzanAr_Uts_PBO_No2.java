/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fauzanar_uts_pbo;

/**
 *
 * @author hp
 */
public class FauzanAr_Uts_PBO {
    private String name;
  private int age;
  
  public Student(String name, int age){
    this.name = name;
    this.age = age;
  }

  public void display_info(){
    System.out.println("hai "+ name + ", usia anda sekarang "+age);
  }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Student student1 = new Student("Fauzan", 20);
    Student student2 = new Student("Ahmad", 20);
    Student student3 = new Student("Raihan", 20);

    student1.display_info();
    student2.display_info();
    student3.display_info();
  
        // TODO code application logic here
    }
    
}
