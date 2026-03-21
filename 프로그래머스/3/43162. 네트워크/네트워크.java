class Solution {
    int[] visited;
    int[][] computers;
    int n;
    public int solution(int n, int[][] computers) {
        this.n=n;
        this.computers=computers;
        int answer = 0;
        this.visited= new int[n];
        for(int i=0; i<n; i++){
            if(visited[i]==0){
                visited[i]=1;
                answer++;
                dfs(i);
            }
        }
        return answer;
    }
    void dfs(int index){
        for(int i=0; i<n; i++){
            if(visited[i]==0&&computers[index][i]==1){
                visited[i]=1;
                dfs(i);
            }
        }
    }
}