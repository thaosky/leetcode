**Palindrome** hay còn gọi là xâu đối xứng  
Xâu đối gương là tên gọi của những xâu kí tự mà khi viết từ phải qua trái hay từ trái qua phải thì xâu đó không thay đổi. VD: MADAM, IOI,…  
Phần lớn trong chúng thường đi kèm với quy hoạch động  
// BT cơ bản kiểm tra Palindrome  O(n)
```java
    boolean isPalindrome(String s) {
        n = s.length;
        loop( i = 0 -> n/2)
            if(s[i] != s[n - i]) return false;
            
        return true;    
        }
```
