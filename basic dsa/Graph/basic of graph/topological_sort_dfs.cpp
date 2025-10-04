#include<iostream>
#include<vector>
#include<stack>


using namespace std;

vector<vector<int> > adj;
stack<int> s;
vector<bool>visited;
vector<int>ans;

void dfs(int node){
	visited[node]=1;
	for(auto it:adj[node]){
		if(!visited[it]) dfs(it);
	}
	s.push(node);
}

vector<int> topodfs(int v){
	visited.assign(v+1,0);
	
	for(int i=1;i<v+1;i++){
		if(!visited[i]){
			dfs(i);
		}
	}
	while(!s.empty()){
		ans.push_back(s.top());
		s.pop();
	}
	return ans;
}

void display(int v){
	for(int i=1;i<=v;i++){
		cout<<"Node :"<<i<<" ";
		for(auto it:adj[i]){
			cout<<"( -> Neigbour :"<<it<<")"<<" ";
		}
		cout<<"\n";
	}
}

void printpath(vector<int> &result){
	
	cout<<"the Topolgical sort using dfs is:\n";
	for (auto x : result) {
        cout << x << " ";
    }
	cout<<"\n";
}

int main(){
	int v,e;
	cout<<"enter the vertices and edge:";
	cin>>v>>e;
	adj.resize(v+1);
	
	for(int i=1;i<=e;i++){
		int u,v;
		cout<<"Enter the edge (start,end node):";
		cin>>u>>v;
		adj[u].push_back(v);
	}
	
	display(v);
	
	vector<int>result;
	
	result=topodfs(v);
	
	printpath(result);
	return 0;
	
	
}
