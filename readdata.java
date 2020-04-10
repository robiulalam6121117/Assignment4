/*
 */
package assignment;
import java.util.Arrays;
import java.util.HashMap; 
import java.util.Map;
/**
 *
 * @author DELL
 */
public class readdata{
    public static void main(String[] args) throws Exception{
        
    String val=null;
    String movie=null;
    String year=null;
    int year_in_num;
    String genre=null;
    int recent =0;
    int max=0;
    String recent_movie=null;
    
    int Advent_count=0;
           int romance_count=0;
           int thrill_count=0;
           int comedy_count=0;
           int horror_count=0;
           int drama_count=0;
           int anim_count=0;
           int fant_count=0;
           int myst_count=0;
           int child_count=0;
           int doc_count=0;
           int war_count=0;
           int scifi_count=0;
           int imax_count=0;
           int crime_count=0;
           int action_count=0;
           
           
                
    
    HashMap<Integer, String> map 
            = new HashMap<>();
            
    test t=new test("C://Users//DELL//Downloads//poi-bin-4.1.2-20200217//poi-4.1.2//movies.xlsx");
    for(int i=1;i<5800;i++){
          val=t.getCelldata("movies", 1, i);
          movie=val.substring(0,val.indexOf("(")-1);  //extracting movie names
          System.out.println(movie);

         System.out.println(t.getCelldata("movies", 1, i));   
         year=val.substring(val.lastIndexOf("(")+1, val.lastIndexOf(")"));   //extracting years
          System.out.println(year);
          
          year_in_num=Integer.parseInt(year);  //converting year into number
          
          /*if(year_in_num>recent){
              recent=year_in_num;
          }  */
            
          
          
          map.put(year_in_num,movie);
          if(year_in_num>=1998&&year_in_num<=2002){
              recent=year_in_num;
          }
          if(map.containsKey(recent)){
              recent_movie=map.get(recent);
          }
          
           
          }
               
           
    
    
    
    
          
          
          for(int j=1;j<58099;j++){
              genre=t.getCelldata("movies", 2, j);                          //Adventure,drama,thriller,Comedy,Romance
                String keyword = "Adventure";
                String keyword2="Drama";
                String keyword3="Romance";
                String keyword4="Thriller";
                String keyword5="Comedy";
                String keyword6="Horror";
                String keyword7="Animation";
                String keyword8="Fantasy";
                String keyword9="Children";
                String keyword10="Crime";
                String keyword11="Sci-Fi";
                String keyword12="Mystery";
                String keyword13="IMAX";
                String keyword14="Action";
                String keyword15="War";
                String keyword16="Documentary";
                
           
                

Boolean found = Arrays.asList(genre.split(" ")).contains(keyword);
Boolean found1 = Arrays.asList(genre.split(" ")).contains(keyword2);
Boolean found2 = Arrays.asList(genre.split(" ")).contains(keyword3);
Boolean found3 = Arrays.asList(genre.split(" ")).contains(keyword4);
Boolean found4 = Arrays.asList(genre.split(" ")).contains(keyword5);
Boolean found5 = Arrays.asList(genre.split(" ")).contains(keyword6);
Boolean found6 = Arrays.asList(genre.split(" ")).contains(keyword7);
Boolean found7 = Arrays.asList(genre.split(" ")).contains(keyword8);
Boolean found8 = Arrays.asList(genre.split(" ")).contains(keyword9);
Boolean found9 = Arrays.asList(genre.split(" ")).contains(keyword10);
Boolean found10 = Arrays.asList(genre.split(" ")).contains(keyword11);
Boolean found11 = Arrays.asList(genre.split(" ")).contains(keyword12);
Boolean found12 = Arrays.asList(genre.split(" ")).contains(keyword13);
Boolean found13 = Arrays.asList(genre.split(" ")).contains(keyword14);
Boolean found14 = Arrays.asList(genre.split(" ")).contains(keyword15);
Boolean found15 = Arrays.asList(genre.split(" ")).contains(keyword16);





if(found){
    Advent_count++;
     
}
if(found1){
    drama_count++;
    
}
if(found2){
    romance_count++;
}
if(found3){
    thrill_count++;
    
}
if(found4){
   comedy_count++;
}
if(found5){
    horror_count++;
}   
if(found6){            
              
                
    anim_count++;
     
}
if(found7){
    fant_count++;
    
}
if(found8){
    child_count++;
}
if(found9){
    crime_count++;
    
}
if(found10){
   scifi_count++;
}
if(found11){
    myst_count++;
}   
if(found12){
   imax_count++;
     
}
if(found13){
    action_count++;
    
}
if(found14){
    war_count++;
}
if(found15){
    doc_count++;
    
}

          }
          
          
          System.out.print("Genres : Number of Movies");
          System.out.println("Adventure : "+Advent_count);
           System.out.println("Drama : "+drama_count);
           System.out.println("Romance : "+romance_count);
          System.out.println("Thriller : "+thrill_count);
          System.out.println("Comdey : "+comedy_count);
          System.out.println("Horror : "+horror_count);
           System.out.println("Animation : "+anim_count);
           System.out.println("Fantasy : "+fant_count);
           System.out.println("Children : "+child_count);
          System.out.println("Crime : "+crime_count);
          System.out.println("Sci-Fi : "+scifi_count);
          System.out.println("Mystery : "+myst_count);
          System.out.println("IMAX : "+imax_count);
          System.out.println("Action  : "+action_count);
          System.out.println("War : "+war_count);
          System.out.println("Documentary : "+doc_count);


          
          
        
    
    }
}
