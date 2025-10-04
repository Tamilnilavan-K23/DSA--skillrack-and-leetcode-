#include<iostream>
#include<vector>
#include<queue>
#include<climits>

using namespace std;

vector<vector<int> > edge;

vector<int>bellman_form(int s,int v){
	vector<int>dis(v+1,INT_MAX);
	dis[s]=0;
	
	for(int i=1;i<=v-1;i++){
		for(auto it:edge){
			int u=it[0];
			int v=it[1];
			int w=it[2];
			if(dis[u]!=INT_MAX && dis[u]+w <dis[v]){
				dis[v]=dis[u]+w;
			}
		}
	}
	
	for(auto it:edge){
			int u=it[0];
			int v=it[1];
			int w=it[2];
			if(dis[u]!=INT_MAX && dis[u]+w <dis[v]){
				return {-1};
			}
		}
		return dis;
}

int main(){
	int v,e;
	cout<<"enter the vertices and edge:";
	cin>>v>>e;
	
	for(int i=1;i<=e;i++){
		int from,to,weight;
		cout<<"Enter the edge as(start node,end node,weight):";
		cin>>from>>to>>weight;
		edge.push_back({from,to,weight});
	}
	
	//display(v,e);
	int src;
	cout<<"Enter the source:";
	cin>>src;
	
	vector<int>path;
	path=bellman_form(src,v);
	
	if(path.size()==1 && path[0]==-1){
		cout<<"Negative cycle is detected!!";
	}else{
		cout<<"The shortest distance from "<<src<< ":"<<endl;
		for(int i=1;i<=v;i++){
			cout<<"to vertex"<<i<<":"<<"\n";
			if(path[i]==INT_MAX){
				cout<<"Unreachable";
			}else{
				cout<<path[i]<<" ";
			}
		}
	}
	
	return 0;
}
