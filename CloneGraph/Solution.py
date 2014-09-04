class Solution:
    # @param node, a undirected graph node
    # @return a undirected graph node
    def cloneGraph(self, node):
        if not node:
            return None
        if not node.neighbors:
            return UndirectedGraphNode(node.label)
        s = []
        s.append(node)
        nodes = {}
        nodes[node.label] = UndirectedGraphNode(node.label)
        while s:
            n = s.pop()
            for neighbor in n.neighbors:
                if neighbor.label not in nodes:
                  temp = UndirectedGraphNode(neighbor.label)
                  nodes[n.label].neighbors.append(temp)        
                  nodes[neighbor.label] = temp
                  s.append(neighbor)
                else:
                  nodes[n.label].neighbors.append(nodes[neighbor.label])
              
        return nodes[node.label]  
