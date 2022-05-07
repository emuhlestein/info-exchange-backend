MARKDOWN NOTES:  
&nbsp; \&nbsp\; add a single space.  
&ensp; \&ensp\; add 2 spaces.  
&emsp; \&emsp\; add 4 spaces.  
  
Spring Boot Notes  
@GetMapping("/api/test1/{id}")  
public String hello(@PathVariable("id") int id) {  
&emsp; return "Your number is " + id;  
}  
  
@GetMapping("/api/test1/{id}/{name}")    
public String hello(@PathVariable("id") int id, @PathVariable("name") String name) {      
&emsp;return "Your number is " + id;  
} 
  

