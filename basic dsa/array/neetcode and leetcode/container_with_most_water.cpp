#include<iostream>
#include<vector>
#include<algorithm>

using namespace std;

int maxArea(vector<int>& heights) {
        int left =0;
        int right=heights.size()-1;
        
        int max_area=0;
        while(left <right){
        	//cout<<heights[left];
        	//cout<<heights[right];
        	int width=right-left;
        	cout<<width;
        	int height=min(heights[left],heights[right]);
        	cout<<height;
        	int area=width*height;
        	cout<<area;
            if(max_area < area){
                max_area=area;
                cout<<"Updated area"<<max_area;
            }
            else if(heights[left]<heights[right]){
                left++;
            }else right--;
        }

        return max_area;
    }

int main(){
	vector <int> hei={1,7,2,5,4,7,3,6};
	
	int result=maxArea(hei);
	
	cout<<result;
	
}
