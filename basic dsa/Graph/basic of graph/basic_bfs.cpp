#include<iostream>
#include<vector>
#include<queue>

using namespace std;

vector<vector<int> >adj;


vector<int> bfsofGraph(int v,int s){
	vector<int> vis(v+1,0);
	vis[s]=1;
	queue<int> q;
	q.push(s);
	
	vector<int>bfs;
	
	while(!q.empty()){
		int node=q.front();
		q.pop();
		bfs.push_back(node);
		
		for(auto it:adj[node]){
			if(!vis[it]){
				vis[it]=1;
				q.push(it);
			}
		}
	}
	return bfs;
}

void printpath(vector<int> path){
	
	cout<<"The path is";
	for(auto it: path){
		cout<<it<<" ";
	}
	cout<<"\n";
}

void display(int v){
	for(int i=1;i<=v;i++){
		cout<<"Node "<<i<<" ";
		for(auto it:adj[i]){
			cout<<"-> ("<<"distance :"<<it<<")";
		}
		cout<<"\n";
	}
}

int main(){
	int vertices,edge;
	cout<<"Enter the vertices edge:";
	cin>>vertices>>edge;
	adj.resize(vertices+1);
	for(int i=1;i<=edge;i++){
		int u,v;
		cout<<"Enter the neigbour edge from start to end vertices:"<<":";
		cin>>u>>v;
		adj[u].push_back(v);
		adj[v].push_back(u);
	}
	
	display(vertices);
	
	int src;
	cout<<"Enter the node find the bfs:";
	cin>>src;
	vector<int>path;
	path=bfsofGraph(vertices,src);
	
	printpath(path);
	
	return 0;
}
