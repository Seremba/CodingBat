public boolean xyzMiddle(String str) {
  int length = str.length();
  if(length <3) return false;

   int ind = str.indexOf("xyz", length/2 - 3) ;
   String firstStr = str.substring(0, ind);
   String secondStr = str.substring(ind+3);

  return (firstStr.length() == secondStr.length() 
        || firstStr.length() + 1 == secondStr.length() 
            || firstStr.length() == secondStr.length() + 1);
}
