import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class MammalData extends PApplet {

Table table;

public void setup() {
  
  table = loadTable("mammals.csv", "header");

  println(table.getRowCount() + " total rows in table"); 

  for (TableRow row : table.rows()) {
    
    int id = row.getInt("id");
    String species = row.getString("species");
    String name = row.getString("name");
    
    println(name + " (" + species + ") has an ID of " + id);
  }
  
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "MammalData" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
