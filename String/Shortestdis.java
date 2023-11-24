package String;

public class Shortestdis {

   
    public static void findShortestdis(String str){
        int i=0,j=0;
        for(int k=0;k<str.length();k++){
           switch (str.charAt(k)) {
            case 'W':
                i--;
                break;
            case 'E':
                i++;
                break;
            case 'S':
                j--;
                break;
            case 'N':
                j++;
                break;
            default:
                break;
           }
        }
      
        System.out.print("The shortest distance is:"+(float)Math.sqrt(i*i+j*j));
    }
    public static void main(String args[]){
        String path="WNEENESENNN";
        findShortestdis(path);
    }
    
}
