/**
 * @ProjectName: leetCodeInJava
 * @PackageName: PACKAGE_NAME
 * @ClassName: Array35
 * @Description:
 * @author: chenliang
 * @date: 2021/4/7 11:50 ����
 * @Copyright: digital china software Inc 2021
 */
public class Array35 {
    public static void main(String[] args) {
        int[] arr={1,4};
        System.out.println(searchInsert(arr,3));
    }

    //����һ�����������һ��Ŀ��ֵ�����������ҵ�Ŀ��ֵ�������������������Ŀ��ֵ�������������У����������ᱻ��˳������λ�á�
    public static  int insertIndex(int[] arr,int num){
        //������ ʱ�临�Ӷ�O(n) �ռ临�Ӷ�O(1)
        //���Ǵ������λ��:��ǰ,�м�,�ظ��滻,���
        for (int i = 0; i < arr.length; i++) {
                //�����������
                if(arr[i]>=num){
                    return  i;
                }
        }
        return  arr.length;
    }

    //ʱ�临�Ӷ�
    /* ����ʱ�临�Ӷ�����
������O(1)
������O(logN)
���Խ�O(n)
���Զ�����O(nlogN)
ƽ����O(n?)
������O(n?)
K�η���O(n^k)
ָ����(2^n)
    */

    //���ַ�
    //�߽紦��ʽ
    public static  int searchInsert(int arr[],int target){
        int len=arr.length;
        int left=0;
        int right=len-1;
        while (left<=right){            // ��left==right������[left, right]��Ȼ��Ч
            int middle=(left+right)/2; //�м��ֵ ��ֹ���
            if(arr[middle]>target){
                right=middle-1;  //target��������
            }else if(arr[middle]<target){
                left=middle+1;                 //target��������
            }else {
                return  middle;
            }
        }
        // �ֱ��������������
        // Ŀ��ֵ����������Ԫ��֮ǰ  [0, -1]
        // Ŀ��ֵ����������ĳһ��Ԫ��  return middle;
        // Ŀ��ֵ���������е�λ�� [left, right]��return  right + 1
        // Ŀ��ֵ����������Ԫ��֮������ [left, right]�� return right + 1


        // ��left>rightʱ �����λ�ö���right+1
        return right+1;

    }


}
