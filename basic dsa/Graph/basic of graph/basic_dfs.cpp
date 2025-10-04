#include<iostream>
#include<vector>
#include<queue>
#include<functional>
using namespace std;

vector<vector<int> > adj;
vector<int>vis;
vector<int>dfs;

vector<int>dfsofGraph(int v,int s){
	vis.resize(v+1,0);
	
	function<void(int)>dfs_vis=[&](int node){
		vis[node]=1;
	    dfs.push_back(node);
	    for(auto it :adj[node]){
		if(!vis[it]){
			dfs_vis(it);
		 }
	 }
};
	dfs_vis(s);
	return dfs;
}


void printpath(int v,vector<int> path){
	cout<<"The path is: ";
	for(auto it:path){
		cout<<it<<" ";
	}
	cout<<endl;
}

void display(int v){
	for(int i=1;i<=v;i++){
		cout<<"node :"<<i<<" ";
		for(auto it:adj[i]){
			cout<<"-> ("<<it<<")";
			
		}
		cout<<"\n";
	}
}

int main(){
	int vertices,edge;
	cout<<"Enter the the node and edge:";
	cin>>vertices>>edge;
	adj.resize(vertices+1);
	
	for(int i=1;i<=edge;i++){
		int u,v;
		cout<<"enter the edge from vertices to vertices:";
		cin>>u>>v;
		adj[u].push_back(v);
		adj[v].push_back(u);
	}
	
	
	display(vertices);
	
	int src;
	cout<<"Enter the source to find the dfs path:";
	cin>>src;
	
	vector<int>path;
	
	path=dfsofGraph(vertices,src);
	
	printpath(vertices,path);
	
}
