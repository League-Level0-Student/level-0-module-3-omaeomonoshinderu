int s= 1;
int x1=1010;
int x2=0;
int c=5;
int co=255;
int col=500;
void draw(){
  background(c, co, col);
for(int i=10; i<500;  i=i+10){
  noFill();
  ellipse(x1, 255, i, i);
}
for(int i=10; i<500;  i=i+10){
  noFill();
  ellipse(x2, 255, i, i);
}
x1=x1 -10*s;
//if x1 = 0 then x1= x1+10
if(x1 == 0){
  s= -1;
}
if(x1 == 1010){
  s= 1;
}
x2=x2 +10*s; 
//if x2 is touches edge -10
if(c < 255){
c= c+5;
}
else{
  c = 0;
}
if(co<255){
co= co+15;
}
else{
 co = 0; 
}
if(col<255){
col= col+10;
}
else{
 col = 0; 
}
}

void setup(){
   size(1010,510); 
}