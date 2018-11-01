size(110,110);
for(int i=10; i<100;  i=i+10){
  noFill();
  if(x % i == 0)
  ellipse(55, 55, i, i);
}