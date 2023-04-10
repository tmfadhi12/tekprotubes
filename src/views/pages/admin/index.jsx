import { Outlet } from "react-router-dom"
import Sidebar from "./sidebar"

const Index = () => {
    return (
        <div>
            <div className="flex px-10 py-6">
                <div className="w-1/5 ml-2">
                    <Sidebar />
                </div>
                <div className="w-4/5 mr-2">
                    <Outlet />
                </div>
            </div>
        </div>
    )
}

export default Index