import React from "react";
import CircleTitle, { CircleSmall, CircleSmallTitle } from "../../Components/Circle";
import { ActivityIndicator, View } from "react-native";
import styles from "./style";
import Square from "../../Components/Square";
import ListImage from "../../Components/ListImage";

export default function Home() {

    return(
        <View style={styles.container}>
           
            <CircleTitle/>
            <CircleSmallTitle/>
            <CircleSmall/>
            {/* <Square /> 
            <ListImage/> */}
        </View>
    );
}