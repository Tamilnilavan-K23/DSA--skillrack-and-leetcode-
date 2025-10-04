#include<iostream>
#include<vector>
#include<algorithm>

using namespace std;

vector<int> twoSum(vector<int>& nums, int target) {
	    vector<pair<int,int>> val;
	    for(int i=0;i<nums.size();i++){
	    	val.push_back({nums[i],i});
		}
		
	
        sort(val.begin(),val.end());
        int left=0;
        int right=nums.size()-1;
        while(left <right){
        	cout<<"left:"<<val[left].first<<"right:"<<val[right].first<<endl;
            int sum=val[left].first+val[right].first;
            if(sum==target){
                return {val[left].second,val[right].second};
            }
            else if(sum<target) left++;
            else right--;
        }
        return {-1,-1};
    }



int main(){
	vector <int> hei={-1,-2,-3,-4,-5};
	int tar=-8;
	vector<int> result=twoSum(hei,tar);
	
	for(auto it:result){
		cout<<it<<" ";
	}
	
}
