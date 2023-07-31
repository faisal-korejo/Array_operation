public class ArrayOperation
{
  public void  traverse(int[] array)
  {
      System.out.print("[");
    for(int i:array) System.out.print(i+",");
      System.out.println("]");
  }

  public int[] insertATBegining(int[] array,int value){
    int[] arr=new int[array.length+1];
    arr[0]=value;
    int i=1;
    while(i<arr.length){
      arr[i]=array[i-1];
      i++;
    } traverse(arr);
    return arr;


  }

public int[] insertATEnd(int[] array,int value){

    int[] arr=new int[array.length+1];
    arr[arr.length-1]=value;
    int i=0;
    while (i<array.length){
      arr[i]=array[i];
      i++;
    } traverse(arr);
    return arr;
}

public int[] insertATMid(int[] array,int value)
{
  int[] arr=new int[array.length+1];
  int count=0;
  int mid=arr.length/2;
  arr[mid]=value;
  for(int i=0;i<arr.length;i++)
  {
    if(i!=mid){
      arr[i]=array[count];
    count++;}
  }  traverse(arr);
 return arr;
}

public int[] insertAtIndex(int[] array,int value,int index)
{
  if(index<0||index>array.length+1) throw new RuntimeException("Index is out of bound");
  int[] arr=new int[array.length+1];
  int count=0;
  arr[index]=value;
  for(int i=0;i<arr.length;i++){
   if(i!=index){
     arr[i]=array[count];
     count++;
   }
  }traverse(arr);
return arr;
}

public int LinearSearch(int[] array,int target)
{
 for(int i=0;i<array.length;i++)
 {
   if(array[i]==target) return i;
 }
return -1;
}

public int BinarySearch(int[] array,int target)
{
  int p=0,q=array.length-1;
  int mid;
  while(p<q){
      mid=(p+q)/2;
      if(array[mid]==target) return mid;
      else if(array[mid]>target) q=mid-1;
      else p=mid+1;
  }
    return -1;

}


public int[] delelteFirst(int[] array)
{
  int[] arr=new int[array.length-1];
  int i=1;
  while(i<arr.length){
      arr[i-1]=array[i];
  }traverse(arr);
  return arr;
}

public int[] deleteLast(int[] array)
{
  int[] arr=new int[array.length-1];
   int i=0;
   while (i<array.length-1){arr[i]=array[i]; i++;}
   traverse(arr);
   return arr;
}

public int[] deleteMid(int[] array)
{
   int[] arr=new int[array.length-1];
   int count=0;
   int i=0;
   while (i<array.length)
   {
      if(i!=(array.length-1)/2)
      {
          arr[count]=array[i];
          count++;
      }
   }traverse(arr);
    return arr;
}

public int[] deleteAnyIndex(int[] array,int index)
{
  if(index<0||index>array.length-1) throw new RuntimeException("Index is incorrect");
  int[] arr=new int[array.length-1];
  int count=0;
  for(int i=0;i<array.length;i++){
     if(i!=index){
        arr[count]=array[i];
        count++;
     }
  }
    traverse(arr);
  return arr;
}


public void reverse(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }traverse(array);
    }

    public int lowest(int[] array){
     int lowest=array[0];
     for(int i=1;i< array.length;i++){
        if(lowest>array[i])
            lowest=array[i];
     }
     return lowest;
    }

public int highest(int[] array)
{
  int highest=array[0];
  for(int i=1;i<array.length;i++)
  {
      if(highest<array[i])
          highest=array[i];
  }
  return highest;
}

public int[] resize(int[] array,int newsize)   {
     if(newsize< array.length+1) throw new RuntimeException("Input is incorrect");
     int [] arr=new int[newsize];
     int i=0;
     while (i<array.length){
        arr[i]=array[i];
        i++;
     }
return arr;
}

public int[] update(int[] array,int value,int index){
      array[index]=value;
    traverse(array);
      return array;
}

public int[] copy(int[] array){
    int[] arr=new int[array.length];
    int i=0;
    while (i<array.length){
       arr[i]=array[i];
       i++;
    }traverse(arr);
    return arr;
}

public int findIndex(int[] array,int value)
{
    int i;
  for ( i=0;i<array.length;i++){
      if(array[i]==value) System.out.println("index number is "+i);
  }
  return i;
}

    public static void main(String[] args) {
      ArrayOperation a=new ArrayOperation();
      int[] array={2,4,6,8};
       a.update(array,10,3);
    }

}


