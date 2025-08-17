public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        result.get(0).add(1);

        for (int i = 1; i < numRows; i++) {
            List<Integer> innerList = result.get(i - 1);
            List<Integer> row = new ArrayList<>();
            row.add(1);
            for (int j = 1; j < innerList.size(); j++) {
                row.add(innerList.get(j - 1) + innerList.get(j));
            }
            row.add(1);
            result.add(row);
        }
        return result;
    }
