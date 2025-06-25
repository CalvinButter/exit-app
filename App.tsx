import React from 'react';
import {StyleSheet, View, Button} from 'react-native';

import NativeExitApp from './specs/NativeExitApp';

function App(): React.JSX.Element {
  const exit = () => {
    NativeExitApp.exitApp();
  };

  return (
    <View style={styles.flex}>
      <View style={styles.flex} />
      <Button title={'exit'} onPress={exit} color={'white'} />
      <View style={styles.flex} />
    </View>
  );
}

const styles = StyleSheet.create({
  flex: {
    flex: 1,
    backgroundColor: 'red',
  },
});

export default App;
