import React from "react"
import { BrowserRouter, Route, Routes } from "react-router-dom"
import { Home, BodyHome, NotFound, Admin, BodyAdmin, LoginPage } from './views/pages'
import Navbar from "./views/layout/navbar"


const Routing = () => {
    return (
        <div className="font-nunito">
            <div>
                <Navbar />
            </div>
            <div className="mb-auto">
                <BrowserRouter>
                    <Routes>
                        <Route path='*' element={<NotFound />} />
                        <Route path="" element={<Home />}>
                            <Route path='' element={<BodyHome />} />
                        </Route>
                        <Route path='/loginadmin' element={<LoginPage />} />
                        <Route exact path="/admin" element={<Admin/>}>
                            <Route path="" element={<BodyAdmin/>}/>
                        </Route>
                    </Routes>
                </BrowserRouter>
            </div>
        </div>
    )
}

export default Routing