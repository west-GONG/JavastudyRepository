public class StringProcess {
    public boolean symmetric(String s){//判断一个字符串是否对称
        if (s == null) {
            return false;
        }
        StringBuilder builder=new StringBuilder(s);
        builder.reverse();
        String s1=builder.toString();
        return s1.equals(s);
    }

    public String reverseStr(String s){//将字符串中单词翻转
        String[] s1=s.split(" ");//分割字符串，放入数组
        StringBuffer newStr=new StringBuffer();//定义新字符串，用于存放
        for(String arr:s1){//遍历集合，取出元素
            StringBuffer reverseStr=new StringBuffer(arr);
            reverseStr.reverse();//实现翻转
            newStr.append(reverseStr);//放入翻转之后的新的字符串
            newStr.append(" ");
        }
        return newStr.toString();
    }

    public void getNumber(String s){//统计字符串中数字的个数
        int digi=0;
        for(int i = 0;i<s.length(); i++){
           char c = s.charAt(i);
           if(c>='0'&&c<='9'){
               digi++;
           }
        }
        System.out.println("数字个数为:"+digi);
    }

    public void number(String s) {//统计由数字组成的字符串中每个数字的出现次数
        int[] counter = new int[10];//将各个数字出现的次数存储在数组counter中
        char[] s1 = s.toCharArray();
        for(int i=48; i<58;i++){
            int a = 0;
            for(int j=0; j<s1.length;j++){
                if(s1[j]==i){
                    a++;//遍历，将i从0 ~ 9中进行遍历，当字符数组中的元素等于0 ~ 9中的一个数字时，进入执行a+1
                }
            }
            counter[i - 48] = a;//将获取的a依次放入数组counter中
        }
        for(int i=0;i<counter.length;i++){
            System.out.println(i + "出现的次数为；" + counter[i]);
        }
    }
}
