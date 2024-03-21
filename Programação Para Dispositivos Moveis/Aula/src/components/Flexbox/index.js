import React from "react";

import { View } from "react-native";



export default function Flexbox() {


    return (

        <View style={{ width: '100%', height: '100%', flexDirection: 'row', gap: 100, flexWrap: 'wrap' }}>

            {/* EXEMPLO INICIAL FLEX */}
            {/* <View style={{ width: 50, height: 50, backgroundColor: 'powderblue'}}></View>
                <View style={{ width: 100, height: 100, backgroundColor: 'skyblue' }}></View>
                <View style={{ width: 150, height: 150, backgroundColor: 'steelblue' }}></View> */}


            {/* EXEMPLO COM JUSTFYCONTENT E ALIGNITENS*/}
            {/* <View style={{  height: 50, backgroundColor: 'powderblue'}}></View>
                <View style={{  height: 50, backgroundColor: 'skyblue' }}></View>
                <View style={{  height: 50, backgroundColor: 'steelblue' }}></View> */}


            {/* EXEMPLO DO FLEX WRAP */}
            {/* <View style={{ width: 50, height: 150, backgroundColor: 'powderblue'}}></View>
                <View style={{ width: 50, height: 150, backgroundColor: 'skyblue' }}></View>
                <View style={{ width: 50, height: 150, backgroundColor: 'steelblue' }}></View>
                <View style={{ width: 50, height: 150, backgroundColor: 'powderblue'}}></View>
                <View style={{ width: 50, height: 150, backgroundColor: 'skyblue' }}></View>
                <View style={{ width: 50, height: 150, backgroundColor: 'steelblue' }}></View> */}


            {/* EXEMPLO DO FLEX GROW */}
            {/* <View style={{ flexGrow: 1, backgroundColor: 'powderblue' }}></View>
            <View style={{ flexGrow: 2, backgroundColor: 'skyblue' }}></View>
            <View style={{ flexGrow: 3, backgroundColor: 'steelblue' }}></View> */}

            {/* EXEMPLO DO FLEX BASIS */}
            <View style={{ flexBasis: 1, backgroundColor: 'powderblue' }}></View>
            <View style={{ flexBasis: 2, backgroundColor: 'skyblue' }}></View>
            <View style={{ flexBasis: 3, backgroundColor: 'steelblue' }}></View>


        </View>
    );
}