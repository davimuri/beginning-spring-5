for i in common test jpa mongodb; do
  for j in main test; do
    for k in java resources; do
      mkdir -p chapter9$i/src/$j/$k;
    done;
  done;
done